import java.util.Map

enum ColorEnum {
    
    WHITE('white','Biały jest mieszaniną wszystkich kolorów.'),
    BLACK('black','Czarny to jest brak koloru...'),
    RED('red','Czerwony jet kolorem krwi.')
    
    final String id;
    final String desc;
    static final Map map
    
    static {
        map = [:] as TreeMap
        values().each {color->
            println("id: " + color.id + ", opis: " + color.desc)
            map.put(color.id,color)
        }
    }

    ColorEnum(String id, String desc) {
        this.id = id
        this.desc = desc
    }
    
    static getColorEnum(id){
        map[id]
    }
}
