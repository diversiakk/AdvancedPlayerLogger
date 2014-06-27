AdvancedPlayerLogger
====================

Player moves logger for bukkit.

====================

This version logs:

- Block Breaking

- Block Placing

- Player Join/Quit

- When player get items from creative mode.

- Commands.

- Player chat event.

====================

Example log:

 - [COMMAND] [21:41:51] [UUID: 92eb937a-b761-33d8-befa-0d9c5329283c] [IP: /127.0.0.1:58178] [WORLD: CraftWorld{name=world}] [LOCATION: 138:63:226] [GAMEMODE: CREATIVE] [HEALTH: 20.0] [OP: true] [ADMINPERM: true] [CMD: '/clear' ] [DISPLAYNAME: _Diverse]
 - [COMMAND] [22:11:59] [UUID: 92eb937a-b761-33d8-befa-0d9c5329283c] [IP: /127.0.0.1:58966] [WORLD: CraftWorld{name=world}] [LOCATION: 138:63:226] [GAMEMODE: CREATIVE] [HEALTH: 20.0] [OP: true] [ADMINPERM: true] [CMD: '/apl reload' ]
 - [BLOCK BREAK] [21:41:44] [UUID: 92eb937a-b761-33d8-befa-0d9c5329283c] [IP: /127.0.0.1:58178] [WORLD: CraftWorld{name=world}] [LOCATION: 138:63:226] [GAMEMODE: CREATIVE] [HEALTH: 20.0] [OP: true] [ADMINPERM: true] [BLOCK: DIRT] [DISPLAYNAME: _Diverse]
 - [BLOCK GET] [21:41:40] [UUID: 92eb937a-b761-33d8-befa-0d9c5329283c] [IP: /127.0.0.1:58178] [WORLD: CraftWorld{name=world}] [LOCATION: 138:63:227] [GAMEMODE: CREATIVE] [HEALTH: 20.0] [OP: true] [ADMINPERM: true] [BLOCK: DIRT] [AMOUNT: 3] [DISPLAYNAME: _Diverse]
 - [BLOCK PLACE] [21:41:42] [UUID: 92eb937a-b761-33d8-befa-0d9c5329283c] [IP: /127.0.0.1:58178] [WORLD: CraftWorld{name=world}] [LOCATION: 138:63:226] [GAMEMODE: CREATIVE] [HEALTH: 20.0] [OP: true] [ADMINPERM: true] [BLOCK: DIRT] [DISPLAYNAME: _Diverse]
 


