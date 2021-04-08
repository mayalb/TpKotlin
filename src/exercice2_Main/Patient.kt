package exercice2_Main

import sun.util.calendar.BaseCalendar
import java.time.LocalDate
import java.util.*

class Patient(
        private val userId:String,
        private val firstName:String,
        private val lastName:String,
        private val userName:String,
        private val password:String,
        private val birthdate: LocalDate,
        private val address:String,
        private val gender:String,
        private val phone:String,
        private val email:String,
        private val weight:Float,
        private val height:Int,
        private val bloodType:String,
        private val personlDesease:String)
    :User(userId, firstName, lastName, userName, password, birthdate, address, gender, phone, email){
}