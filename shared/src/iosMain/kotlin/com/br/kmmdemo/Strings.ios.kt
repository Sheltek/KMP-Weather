package com.br.kmmdemo

import platform.Foundation.NSString
import platform.Foundation.stringWithFormat


actual class StringHelper actual constructor(actual val content: String) {
    actual operator fun invoke(vararg args: Any?) = NSString.stringWithFormat(content, 1)

}

//https://developer.apple.com/library/archive/documentation/Cocoa/Conceptual/Strings/Articles/formatSpecifiers.html
