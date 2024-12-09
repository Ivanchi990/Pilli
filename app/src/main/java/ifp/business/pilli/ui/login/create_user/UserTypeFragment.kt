package ifp.business.pilli.ui.login.create_user

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import ifp.business.pilli.R
import ifp.business.pilli.databinding.FragmentUserTypeBinding

class UserTypeFragment : Fragment()
{
	private var _binding: FragmentUserTypeBinding? = null
	private val binding get() = _binding!!

	override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
	{
		_binding = FragmentUserTypeBinding.inflate(inflater, container, false)

		return binding.root
	}

	override fun onViewCreated(view: View, savedInstanceState: Bundle?)
	{
		super.onViewCreated(view, savedInstanceState)

		initUI()
	}

	private fun initUI()
	{
		binding.tvSecondType.setOnClickListener {
			findNavController().navigate(R.id.action_userTypeFragment_to_careTypeFragment)
		}
	}
}