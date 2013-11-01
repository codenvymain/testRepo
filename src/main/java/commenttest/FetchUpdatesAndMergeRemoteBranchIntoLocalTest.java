//1383192888051_<!--change content-->
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package commenttest;

import java.util.ArrayList;

final class FetchUpdatesAndMergeRemoteBranchIntoLocalTest
{
   private ArrayList<Integer> numbers = new ArrayList<Integer>();

   public JavaCommentsTest()
   {
      numbers.add(1);
      numbers.add(2);
      numbers.add(3);
      numbers.add(4);
      numbers.add(5);
      numbers.add(6);
   }

   public ArrayList<Integer> getNumbers()
   {
      return numbers;
   }

   public Integer sum(Integer x, Integer y)
   {
      return x + y;
   }

   public Integer subtraction(Integer x, Integer y)
   {
      return x - y;
   }
}
