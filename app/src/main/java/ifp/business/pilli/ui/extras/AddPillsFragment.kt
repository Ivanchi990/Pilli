package ifp.business.pilli.ui.extras

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ifp.business.pilli.R
import ifp.business.pilli.databinding.FragmentAddPillsBinding

class AddPillsFragment : Fragment()
{
	private var _binding: FragmentAddPillsBinding? = null
	private val binding get() = _binding!!

	override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
	{
		_binding = FragmentAddPillsBinding.inflate(inflater, container, false)

		return binding.root
	}

	override fun onViewCreated(view: View, savedInstanceState: Bundle?)
	{
		super.onViewCreated(view, savedInstanceState)

		initUI()
	}

	private fun initUI()
	{

	}
}