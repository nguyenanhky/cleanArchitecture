package kynv1.fsoft.apptask.tasks

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kynv1.fsoft.apptask.R
import kynv1.fsoft.apptask.databinding.FragmentTasksBinding


class TasksFragment : Fragment() {

    private lateinit var viewDataBinding:FragmentTasksBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        viewDataBinding = FragmentTasksBinding.inflate(inflater,container,false)
        return viewDataBinding.root
    }

    companion object {

    }
}