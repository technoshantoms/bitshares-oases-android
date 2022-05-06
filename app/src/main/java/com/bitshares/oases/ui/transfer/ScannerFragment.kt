package com.bitshares.oases.ui.transfer

import android.os.Bundle
import android.view.View
import com.bitshares.oases.ui.base.ContainerFragment
import modulon.extensions.viewbinder.cell
import modulon.layout.recycler.section

class ScannerFragment : ContainerFragment() {

    override fun onCreateView() {
        setupAction {
            titleConnectionState("Scan")
            websocketStateMenu()
            walletStateMenu()
        }
        setupRecycler {
            section {
                cell {
                    title = "TODO"
                }
            }
        }
    }

}