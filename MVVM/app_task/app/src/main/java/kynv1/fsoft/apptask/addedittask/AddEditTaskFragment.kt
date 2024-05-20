package kynv1.fsoft.apptask.addedittask

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import kynv1.fsoft.apptask.R
import kynv1.fsoft.apptask.databinding.FragmentAddEditTaskBinding


class AddEditTaskFragment : Fragment() {

    private lateinit var viewDataBinding: FragmentAddEditTaskBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        viewDataBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_add_edit_task, container, false)
        viewDataBinding.lifecycleOwner = this.viewLifecycleOwner
        return viewDataBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupSnackbar()
    }

    private fun setupSnackbar() {

    }
}