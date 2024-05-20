package kynv1.fsoft.apptask.tasks

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kynv1.fsoft.apptask.R
import kynv1.fsoft.apptask.databinding.FragmentTasksBinding


class TasksFragment : Fragment() {

    private lateinit var viewDataBinding: FragmentTasksBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        viewDataBinding = FragmentTasksBinding.inflate(inflater, container, false)
        return viewDataBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupFab()
    }

    private fun setupFab() {
        viewDataBinding.addTaskFab.setOnClickListener {
            navigationToAddNewTask()
        }

    }

    private fun navigationToAddNewTask() {
        val action = TasksFragmentDirections.actionTasksFragmentToAddEditTaskFragment(
            null,
            resources.getString(R.string.add_task)
        )
        findNavController().navigate(action)
    }
}