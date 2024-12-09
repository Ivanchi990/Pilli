package ifp.business.pilli.ui.extras

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import ifp.business.pilli.R
import ifp.business.pilli.databinding.FragmentFrequencyBinding

class FrequencyFragment : Fragment()
{
	private var _binding: FragmentFrequencyBinding? = null
	private val binding get() = _binding!!

	override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
	{
		_binding = FragmentFrequencyBinding.inflate(inflater, container, false)

		return binding.root
	}


	override fun onViewCreated(view: View, savedInstanceState: Bundle?)
	{
		super.onViewCreated(view, savedInstanceState)

		initUI()
	}

	private fun initUI()
	{
		binding.tvFirstFrequency.setOnClickListener {
			findNavController().navigate(R.id.action_frequencyFragment_to_timeFragment)
		}
	}
}