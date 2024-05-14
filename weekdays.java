import java.time.DayOfWeek;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class weekdays {
    public enum Weekday {
        LUNI, MARTI, MIERCURI, JOI, VINERI, SAMBATA, DUMINICA;
    }

    public Weekday[] getDays() {
        boolean weekend = true;
        if (weekend){
            return Weekday.values();
        } else {
            return Weekday.values();
        }
    }
}
public List< DayOfWeek > getDays() {
    weekdays weekend = new weekdays();
    List<DayOfWeek> weekdays = List.of();
    return weekdays ;
}


Set<DayOfWeek> getDays(String flag )
{
    if ( flag.equalsIgnoreCase( "weekdays" ) )     {
        return EnumSet.of(DayOfWeek.LUNI , DayOfWeek.MARTI , DayOfWeek.MIERCURI ,DayOfWeek.JOI , DayOfWeek.VINERI , DayOfWeek.SAMBATA, DayOfWeek.DUMINICA);
    } else    {
        return EnumSet.of(DayOfWeek);
    }
}

public void main() {
}

private DayOfWeek DayOfWeek;
