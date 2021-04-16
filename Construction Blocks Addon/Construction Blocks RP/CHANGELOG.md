# v1.6.0 ChangeLog

### **General**
- Gave items custom tags
- Gave blocks tags so they can be mined faster. (don't think it did anything... Minecraft bug?)
- All stairs can now be placed up-side-down. (You may have to replace them, blockstate change)
- Removed in-game changelog UI
- Added test features toggle in resource pack and behavior pack settings. Toggle them on for test features, **note** that you may have to be in the Minecraft Beta for them to work. select pack, click the gear/cog move the slider to the right to turn on pack testing.

### **New**
- Chains in all metal types, including copper and all its stages
- Framed glass in all 16 colors, including tinted glass.
- Seamless stained glass in all 16 colors, including tinted glass. 
- Globe banner pattern for glass (does not work for banners), get it from a last level cartography villager.
- Added vertical slabs to support 'More Stairs and Slabs Addon'
- Crafting stations. In all wood types. supports all crafting table recipes plus includes custom 'crafting_station' recipe tag for other supported addons.
- LED Torches, like normal torches but have no particles and can be toggled on/off.

All copper blocks (copper beam and copper chain) will oxidize after 1200 ticks or 10 mins, this is planned to bve increased to be the same speed as copper blocks. The blocks currently will not save their data (block rotation) so you may have to replace the block.

### **Recipes**
- Removed old beam recipe. New beam recipe (check below)
- Paint roller can only be crafted using iron sticks
- Removed colored paint roller recipes, now use paint buckets
- Beam recipe is now an 'I' shape of ingots, currently no recipe for anvil and rusty iron beam.
- Metal chain recipes, same as vanilla but use their dedicated nugget and metal item.
- Wooden chain reicpes, similar shape to metal chain but use sticks instead of nuggets and planks instead of metal item.
- Framed glass is normal stained glass inside a stonecutter.
- Patterned glass. eight stained glass blocks with one banner pattern in the middle.
- Terracotta shingles. place seven terracotta blocks in the crafting grid except bottom left and right slots.
- Vertical slabs are crafted similar to regular slabs but vertically. three full blocks going up, some blocks can be crafted using the stonecutter.
- Crafting stations can be crafted by placing a regular crafting table inside the crafting grid. (other table varients not added)
- Copper chain and beams can be waxed by combining the copper stage that you want plus one honeycomb, shapeless.

### **Test Features**
- Added text features toggle
- Added recipes for 1.17 features, i.e. copper, tinted recipes will come once tinted glass has been added to the beta

### **Loot Tables**
- Added loot tables for all new blocks.

### **Changed**
- Colored grass blocks can now be conterted to farmland by clicking with any tiered hoe.
- Colored dirt path blocks can now be conterted to farmland by clicking with any tiered hoe.
- Changed up texture names located insde `terrain_textures.json`
- Paint bucket will now stack to 16 instead of 64
- Changed up recipe names, and locations.

### **Fixes**
- Error that would spam console when generating a world.
- When creating double slab it would not take placed item. creating a dublication bug.