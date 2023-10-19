import SwiftUI
import shared
import domain

struct ContentView: View {
	let greet = GreetingHelper().greet()

    let response = WeatherRepoImplementation().getForeCastFromCity("Dallas")

	var body: some View {
		Text(greet)
	}
}

struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
		ContentView()
	}
}