//import java.util.Scanner
fun rand(start: Int, end: Int): Int {
    return (start..end).random()
}
fun main(args:Array<String>){
    var scoretatal:Int=0
    //la liste des mots
    val mots= arrayOf("c","o","c#","l+","php","html","java","css","python","mysql","swift","kotlin")
    while(true){
        val n=(rand(1, 6))
        println("Veuillez introduire un mot de longueur $n")
        val stringword = readLine()!!

        if (stringword.length==n){

            //liste des mots de longueur n
            var l=Array(2){""}
            var i=0
            for(item in mots){
                if(item.length==n){
                    l.set(i,item)
                    i++

                }
            }
            //GET RANDOM WORD FROM LIST L
            var randomword=l.random()
            println("Le mot de longueur $n est $randomword")
            if(randomword==stringword){
                scoretatal=scoretatal+5
                println("Bravo !!!! Vous avez obtenu 5 points, le score total est : $scoretatal  points ")
            }else{
                println(" Echec !!!! le score total est : $scoretatal  points ")
            }


        }else{
            println(" Echec ! la taille du mot saisi n'est pas égale à la taille demandée ")
        }
    }



}