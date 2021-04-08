package exercice2_Main

import java.time.LocalDate
import java.time.LocalTime

object Singleton {
    var bookinglist : MutableList<Booking> = mutableListOf()
    var treatmentlist : MutableList<Treatment> = mutableListOf()

    var listpatient= arrayListOf<Patient>()
    var listdoctors= arrayListOf<Doctor>()
    init {
        val patient1=Patient("17/0140","Maya","larbi","maymouy","123",LocalDate.of(1999,10,1),"Alia","femme","07879167","hm_larbi@esi.dz",58.0F,169,"B-","headacke")
        val patient2=Patient("16/0140","Safi","rihani","sa","123",LocalDate.of(1998,10,1),"Bouraoui","homme","08379","gs_rihani@esi.dz",68.0F,179,"B-","insomnie")
        listpatient.add(patient1)
        listpatient.add(patient2)
        val medecin=Doctor("04/0140","youcef","larbi","yoyo","123",LocalDate.of(1980,11,1),"USA","HOMME","0787999167","youcef@gmail.com",75.33,20.9,"youcef","generaliste")
       listdoctors.add(medecin)
        val booking=Booking(1, LocalDate.of(2020,3,1), LocalTime.of(12,23),patient1,medecin)
        bookinglist.add(booking)
    }

    fun getlistpatient():ArrayList<Patient>{
        return this.listpatient
    }
    fun getlistdoctor():ArrayList<Doctor>{
        return this.listdoctors
    }



    fun getbookinglist(): MutableList<Booking>{
        return this.bookinglist
    }
    fun gettreatementlist(): MutableList<Treatment>{
        return this.treatmentlist
    }
}