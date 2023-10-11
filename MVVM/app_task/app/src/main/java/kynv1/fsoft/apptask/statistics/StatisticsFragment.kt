package kynv1.fsoft.apptask.statistics

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import kynv1.fsoft.apptask.R
import kynv1.fsoft.apptask.databinding.FragmentStatisticsBinding

class StatisticsFragment : Fragment() {
    private lateinit var viewDataBinding: FragmentStatisticsBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        viewDataBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_statistics, container, false)

        return viewDataBinding.root
    }

    companion object {

    }
}