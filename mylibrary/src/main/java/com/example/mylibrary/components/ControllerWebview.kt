package com.example.mylibrary.components

import android.webkit.WebView
import android.webkit.WebViewClient

class ControllerWebview (private val webView: WebView) {

    init {

        webView.webViewClient = WebViewClient()

        // Opcional: Habilita JavaScript. La mayoría de las webs modernas lo necesitan.
        webView.settings.javaScriptEnabled = true
    }
//    La app le pasa la URL a la librería llamando a un método público (cargarUrl) y entregándole la URL como un parámetro (o argumento).

    fun cargarUrl(url: String) {
        webView.loadUrl(url)
    }
}