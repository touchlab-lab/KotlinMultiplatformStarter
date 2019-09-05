package sample

import platform.Foundation.*

actual class KMPDate actual constructor(formatString: String) {

    private val dateFormatter = NSDateFormatter().apply {
        this.dateFormat = formatString
    }

    actual fun asString(): String {
        return dateFormatter.stringFromDate(NSDate())
    }
}