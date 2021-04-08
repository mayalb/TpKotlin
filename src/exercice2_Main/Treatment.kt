package exercice2_Main

import java.time.LocalDate
import java.time.LocalDateTime
import java.util.*

class Treatment(
        private val treatmentId:Long,
        private val disease:String,
        private val treatmentDescription:String,
        private val treatmentDate:LocalDate,
        private val patient: Patient
) {
    //when create treatement we should create booking
  fun getpatient():Patient{
      return this.patient
  }
    fun getTreatmentDate():LocalDate{
        return this.treatmentDate
    }


}