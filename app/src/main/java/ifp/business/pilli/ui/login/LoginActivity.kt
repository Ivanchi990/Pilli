package ifp.business.pilli.ui.login

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import ifp.business.pilli.R
import ifp.business.pilli.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity()
{
	private lateinit var binding: ActivityLoginBinding

	override fun onCreate(savedInstanceState: Bundle?)
	{
		super.onCreate(savedInstanceState)
		binding = ActivityLoginBinding.inflate(layoutInflater)

		setContentView(binding.root)
	}
}