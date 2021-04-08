package exercice2_Main

class BookingManager {
    fun addBooking(booking:Booking){
        var listbooking=Singleton.getbookinglist()
        listbooking.add(booking)
    }
    fun getBookingByPatient(patient:Patient):List<Booking>{
        var listbooking=Singleton.getbookinglist()
        var list= arrayListOf<Booking>()
        for(booking in listbooking){
            if(booking.getpatient().equals(patient)){
                list.add(booking)
            }
        }
        return list

    }
    fun getBookingByDoctor(doctor:Doctor):List<Booking>{
        var listbooking=Singleton.getbookinglist()
        var list= arrayListOf<Booking>()
        for(booking in listbooking){
            if(booking.getdoctor().equals(doctor)){
                list.add(booking)
            }
        }
        return list
    }
}