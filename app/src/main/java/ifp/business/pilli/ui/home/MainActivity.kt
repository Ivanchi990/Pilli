package ifp.business.pilli.ui.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint
import ifp.business.pilli.databinding.ActivityMainBinding

@AndroidEntryPoint
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
		if(userLoged())
		{
			initNavigation()
		}
		else
		{
			initLogin()
		}
	}

	private fun initLogin()
	{

	}

	private fun initNavigation()
	{

	}

	private fun userLoged(): Boolean
	{
		return true
	}
}