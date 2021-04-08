package exercice2_Main

import java.time.LocalDate
import java.util.*

class Doctor(
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
        private val latitude:Double,
        private val longitude:Double,
        private val facebookPage:String,
        private val speciality:String) :User(userId, firstName, lastName, userName, password, birthdate, address, gender, phone, email){
            fun getiddoctor():String{
                return this.userId
            }
    fun getnamedoctor():String{
        return this.firstName
    }

}