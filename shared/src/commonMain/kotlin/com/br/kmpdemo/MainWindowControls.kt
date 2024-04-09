package com.br.kmpdemo

import com.br.kmpdemo.MainWindowControls.Companion.EMPTY_TOOLBAR_TITLE
import com.br.kmpdemo.utils.MutableStateFlowDelegate
import com.br.kmpdemo.viewmodels.MainActivityViewModel
import dev.icerock.moko.resources.StringResource
import com.sheltek.kmpweather.compose.SharedRes

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