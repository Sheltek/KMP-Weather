import SwiftUI
import shared

@main
class KmmApp {
    init() {
        HelperKt.doInitKoin()
    }

    static func main() {
        MainiosKt.main_ios()
    }
}
