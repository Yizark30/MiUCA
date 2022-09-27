package ni.edu.uca.miuca

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import ni.edu.uca.miuca.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    val usuario: String = "Yizark"
    val pw: String = "1234"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        iniciar()
    }

    private fun iniciar() {
        binding.btnIngresar.setOnClickListener{
            val user = binding.etUsuario.text.toString()
            val pw = binding.etPw.text.toString()
            ingresar(user, pw)
        }
    }

    private fun ingresar(user: String, pw: String) {
        if (this.usuario.equals(user)and this.pw.equals(pw)){
            limpiar()
            val nuevaVista: Intent = Intent(this, Principal::class.java)
            startActivity(nuevaVista)
        }else{
            Toast.makeText( this,"Datos Erroneos", Toast.LENGTH_SHORT).show()
        }

    }

    private fun limpiar(){
        binding.etUsuario.setText("")
        binding.etPw.setText("")
    }


}