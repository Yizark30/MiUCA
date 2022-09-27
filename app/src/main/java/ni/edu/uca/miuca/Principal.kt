package ni.edu.uca.miuca

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import ni.edu.uca.miuca.databinding.ActivityMainBinding
import ni.edu.uca.miuca.databinding.ActivityPrincipalBinding

class Principal : AppCompatActivity() {
    private lateinit var binding: ActivityPrincipalBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPrincipalBinding.inflate(layoutInflater)
        setContentView(binding.root)
        iniciar()
    }

    private fun iniciar() {
        binding.btnSaludar.setOnClickListener{
            Toast.makeText( this,"Somos UCA", Toast.LENGTH_SHORT).show()
        }
    }
}