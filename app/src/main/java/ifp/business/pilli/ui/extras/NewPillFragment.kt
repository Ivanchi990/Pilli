package ifp.business.pilli.ui.extras

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import ifp.business.pilli.R
import ifp.business.pilli.databinding.FragmentNewPillBinding

class NewPillFragment : Fragment()
{
	private var _binding: FragmentNewPillBinding? = null
	private val binding get() = _binding!!

	override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
	{
		_binding = FragmentNewPillBinding.inflate(inflater, container, false)

		return binding.root
	}


	override fun onViewCreated(view: View, savedInstanceState: Bundle?)
	{
		super.onViewCreated(view, savedInstanceState)

		initUI()
	}

	private fun initUI()
	{
		binding.btnAddPill.setOnClickListener {
			findNavController().navigate(R.id.action_newPillFragment_to_addPillsFragment)
		}
	}
}