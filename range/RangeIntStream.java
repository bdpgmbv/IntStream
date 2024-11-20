package range;

import java.util.stream.IntStream;
import java.util.regex.Pattern;
import java.util.stream.Stream;

/*
 * 11/19/2024 - 4:47 AM
 * @author Vyshali Prabananth Lal
 */

public class RangeIntStream {
 public static void main(String[] args) {
  IntStream intStreamFromRange = IntStream.range(1,5);

  IntStream streamFromString = "umbrella".chars();

  Stream<String> streamFromPattern = Pattern.compile(", ").splitAsStream("a, b, c, d");
 }
}

/*
As Stream<T> is a generic interface, and there is no way to use primitives as a type parameter with generics
 */
