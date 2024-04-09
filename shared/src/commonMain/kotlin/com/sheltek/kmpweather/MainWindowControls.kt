package com.sheltek.kmpweather

import com.br.kmpdemo.utils.MutableStateFlowDelegate
import com.sheltek.kmpweather.MainWindowControls.Companion.EMPTY_TOOLBAR_TITLE
import com.sheltek.kmpweather.compose.SharedRes
import com.sheltek.kmpweather.viewmodels.MainActivityViewModel
import dev.icerock.moko.resources.StringResource

interface MainWindowControls {
    var title: StringResource
    var hideNavBar: Boolean

    fun reset()

    companion object {
        val EMPTY_TOOLBAR_TITLE = SharedRes.strings.empty_string
    }
}

class MainWindowControlsImplementation(viewModel: MainActivityViewModel) : MainWindowControls {
    override var title by MutableStateFlowDelegate(viewModel.appTitle)
    override var hideNavBar by MutableStateFlowDelegate(viewModel.hideNavBar)

    override fun reset() {
        title = EMPTY_TOOLBAR_TITLE
        hideNavBar = false
    }
}