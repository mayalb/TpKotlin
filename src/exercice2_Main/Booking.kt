package exercice2_Main

import java.sql.Time
import java.time.LocalDate
import java.time.LocalTime
import java.util.*

class Booking(private val bookingId:Long,private val bookingDate:LocalDate,private val bookingTime:LocalTime,private val patient :Patient,private val doctor:Doctor) {
    fun getpatient ():Patient{
        return this.patient
    }
    fun getdoctor():Doctor{
        return  this.doctor
    }
    fun getidbooking():Long{
        return this.bookingId
    }



}