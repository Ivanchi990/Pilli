package ifp.business.pilli.ui.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ifp.business.pilli.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity()
{
	private lateinit var binding: ActivityMainBinding

	override fun onCreate(savedInstanceState: Bundle?)
	{
		super.onCreate(savedInstanceState)
		binding = ActivityMainBinding.inflate(layoutInflater)

		initUI()

		setContentView(binding.root)
	}

	private fun initUI()
	{

	}
}