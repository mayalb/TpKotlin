package exercice2_Main

import java.time.LocalDate

class TreatmentManager {
    fun addTreatment(treatment:Treatment){
        var listtreatment=Singleton.gettreatementlist()
        listtreatment.add(treatment)
    }
    fun getTreatmentsByPatient(patient:Patient):List<Treatment>{
        var listtraitement=Singleton.gettreatementlist()
        var list= arrayListOf<Treatment>()
        for(treatement in listtraitement){
            if(treatement.getpatient().equals(patient)){
                list.add(treatement)
            }
        }
        return list
    }
    fun getLastTreatment(patient:Patient):Treatment?{
       var listtraitement=Singleton.gettreatementlist()
        var date=LocalDate.of(0,0,0)
        var result:Treatment?=null

        for(treatement in listtraitement){
            if(treatement.getpatient().equals(patient)){
                if(treatement.getTreatmentDate()>date){
                    date=treatement.getTreatmentDate()
                    result=treatement
                }

            }
        }
        return result
    }
}