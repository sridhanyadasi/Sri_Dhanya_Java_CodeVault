/* - Interface 4: `Amphibious` - This interface should extend `Moveable` and `Stoppable`. -
Additionally, define a method `void floatOnWater()` representing the ability to float on water. */

package com.te.interface2;

public interface Amphibious extends Moveable, Stoppable, Honkable {
	
	public void floatOnWater();
	
	
}
