package ifp.business.pilli.ui.login.introduction

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import ifp.business.pilli.R
import ifp.business.pilli.databinding.FragmentIntroductionBinding
import ifp.business.pilli.ui.login.create_user.UserTypeFragment

class IntroductionFragment : Fragment()
{
	private var _binding: FragmentIntroductionBinding? = null
	private val binding get() = _binding!!

	override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
	{
		_binding = FragmentIntroductionBinding.inflate(inflater, container, false)

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
			findNavController().navigate(R.id.action_introductionFragment_to_userTypeFragment)
		}
	}
}