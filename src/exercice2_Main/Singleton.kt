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

        //bookinglist.add(booking)
    }
    val booking=Booking(10, LocalDate.of(2020,3,1), LocalTime.of(12,23), getlistpatient()[0], getlistdoctor()[0])
    val booking1=Booking(11, LocalDate.of(2019,3,1), LocalTime.of(15,23), getlistpatient()[1], getlistdoctor()[0])
    val booking2=Booking(12, LocalDate.of(2009,3,1), LocalTime.of(15,15), getlistpatient()[1], getlistdoctor()[0])
    val treatmenent=Treatment(15,"insomnie","je n'arrive pas a dormir",LocalDate.of(2020,4,1), booking)
    val treatmenent1=Treatment(16,"headcake","deux foi par jour",LocalDate.of(2020,4,1), booking1)
    val treatmenent2=Treatment(14,"insomnie","Etat grave",LocalDate.of(2020,5,1), booking)
    fun getlistpatient():ArrayList<Patient>{
        return this.listpatient
    }
    fun getlistdoctor():ArrayList<Doctor>{
        return this.listdoctors
    }
     fun getTreatement():Treatment{
         return this.treatmenent
     }
    fun getbooking():Booking{
        return this.booking
    }

    fun getbookinglist(): MutableList<Booking>{
        return this.bookinglist
    }
    fun gettreatementlist(): MutableList<Treatment>{
        return this.treatmentlist
    }
}