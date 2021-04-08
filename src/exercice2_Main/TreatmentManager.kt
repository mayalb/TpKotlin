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
            if(treatement.getbooking().getpatient().equals(patient)){
                list.add(treatement)
            }
        }
        return list
    }
    fun getLastTreatment(patient:Patient):Treatment{
       var listtraitement=this.getTreatmentsByPatient(patient)
        var date=LocalDate.of(0,1,1)
       var result=this.getTreatmentsByPatient(patient)[0]
        for(treatement in listtraitement){
                if(treatement.getTreatmentDate()>date){
                    date=treatement.getTreatmentDate()
                    result=treatement

                }
        }
        return result
    }
}