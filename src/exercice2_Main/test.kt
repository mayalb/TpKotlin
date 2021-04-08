package exercice2_Main
    fun main (args:Array<String>) {


        var bookingmanager = BookingManager()
        var treatmenetmanager = TreatmentManager()

        //tester la  méthode add booking
        println("Test des méthodes addbooking addtreatement")
        bookingmanager.addBooking(Singleton.booking)
        bookingmanager.addBooking(Singleton.booking1)
        bookingmanager.addBooking(Singleton.booking2)
        var id = Singleton.getbookinglist()[0].getidbooking()

        println("booking ayant Id $id a été ajouté à la liste des RDV avec succés .")


        //tester la  méthode add treatment
        treatmenetmanager.addTreatment(Singleton.treatmenent)
        treatmenetmanager.addTreatment(Singleton.treatmenent1)
        treatmenetmanager.addTreatment(Singleton.treatmenent2)
        var idtreatement = Singleton.gettreatementlist()[0].getTreatementId()
        println("Treatement ayant Id $idtreatement a été ajouté à la liste des RDV avec succés .")
        println("")
        //Tester la méthode getbookingBypatient
        println("Test de la méthode getbookingBypatient")
        //pour chaque patient get sa liste des bookings
        val listpatient = Singleton.getlistpatient()
        for (patient in listpatient) {
            val iduser = patient.getIdPatient()
            val nompatient = patient.getNameuser()
            val listbookingbypatient = bookingmanager.getBookingByPatient(patient)
            if (listbookingbypatient != null) {
                println("la liste des booking du patient $nompatient ayant l'id $iduser est :")
                for (bookingpas in listbookingbypatient) {
                    val idbook = bookingpas.getidbooking()
                    println("Id du booking : $idbook")
                }
            } else {
                println("la liste des booking du patient $nompatient ayant l'id $iduser est vide")
            }
        }

        //Tester la methode getBooking ByDoctor
        println("Test de la méthode getbookingByDoctor")
        //pour chaque patient get sa liste des bookings
        val listdoctor = Singleton.getlistdoctor()
        for (doctor in listdoctor) {
            val iddoctor = doctor.getiddoctor()
            val nomdoctor = doctor.getnamedoctor()
            val listbookingbydoctor = bookingmanager.getBookingByDoctor(doctor)
            if (listbookingbydoctor != null) {
                println("la liste des booking du docteur $nomdoctor ayant l'id $iddoctor est :")
                for (bookingdoc in listbookingbydoctor) {
                    val idbook = bookingdoc.getidbooking()
                    println("Id du booking : $idbook")
                }
            } else {
                println("la liste des booking du patient $nomdoctor ayant l'id $iddoctor est vide")
            }
        }
        //Tester la méthode getTreatmentsByPatient
        println("Test de la méthode getTreatmentsByPatient---Pour chaque patient afficher sa liste des traitements:")

        for(patient in listpatient){
            val nom=patient.getNameuser()
            val id=patient.getIdPatient()
            println("la liste des traitements du patient $nom ayant id : $id ")
           var listtraitement= treatmenetmanager.getTreatmentsByPatient(patient)

            for(traitement in listtraitement){

                val idtaitement=traitement.getTreatementId()
                val datetraitement=traitement.getTreatmentDate()
                println("Traitement $idtaitement , sa date est $datetraitement .")
            }
        }
        //Tester la méthode getlastTreatments
        println("Test de la méthode getLastTreatment---Pour chaque patient afficher le dernier traitement:")
        for(patient in listpatient){
            val nom=patient.getNameuser()
            val id=patient.getIdPatient()
            println("la liste des traitements du patient $nom ayant id : $id ")
            val traitement=treatmenetmanager.getLastTreatment(patient)

                val idtrait= traitement.getTreatementId()
                val datetrait=traitement.getTreatmentDate()
                println("le dernier traitement est $idtrait , sa date est $datetrait.")

        }


    }
