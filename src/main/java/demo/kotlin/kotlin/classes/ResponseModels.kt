package demo.kotlin.java.kotlin

/**
 * Multiple classes in single file
 */

data class ForecastResponse(val city: City, val list: List<Forecast>)

data class City(val id: Long, val name: String, val country: String, val population: Int, val coord: Coordinates)

data class Coordinates(val lon: Float, val lat: Float)

data class Weather(val id: Long, val main: String, val description: String, val icon: String)

data class Temperature(val day: Float, val min: Float, val max: Float, val night: Float, val eve: Float, val morn: Float)

data class Forecast(val dt: Long, val pressure: Float, val humidity: Int, val temp: Temperature, val weather: List<Weather>,
                    val speed: Float, val deg: Int, val clouds: Int, val rain: Float)