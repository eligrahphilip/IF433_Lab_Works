package oop_00000138865_EligrahPhilipMapaKogoya.week07

// CHECKPOINT 8: create AppState enum
enum class AppState {
    STARTING, RUNNING, STOPPED
}

// CHECKPOINT 9: create ApiResponse sealed class
sealed class ApiResponse {
    data class Success(val data: String) : ApiResponse()
    data class Error(val message: String) : ApiResponse()
    object Loading : ApiResponse()
}
