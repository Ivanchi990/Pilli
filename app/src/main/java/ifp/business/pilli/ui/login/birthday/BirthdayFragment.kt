package ifp.business.pilli.ui.login.birthday

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import ifp.business.pilli.R
import ifp.business.pilli.databinding.FragmentBirthdayBinding

class BirthdayFragment : Fragment()
{
	private var _binding: FragmentBirthdayBinding? = null
	private val binding get() = _binding!!

	override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
	{
		_binding = FragmentBirthdayBinding.inflate(inflater, container, false)

		return binding.root
	}

	override fun onViewCreated(view: View, savedInstanceState: Bundle?)
	{
		super.onViewCreated(view, savedInstanceState)

		initUI()
	}

	private fun initUI()
	{
		binding.btnRounded.setOnClickListener {
			findNavController().navigate(R.id.action_birthdayFragment_to_addDeviceFragment)
		}
	}
}