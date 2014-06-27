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

[JOIN] [21:40:51] [UUID: 92eb937a-b761-33d8-befa-0d9c5329283c] [IP: /127.0.0.1:58178] [WORLD: CraftWorld{name=world}] [LOCATION: 137:63:227] [GAMEMODE: CREATIVE] [HEALTH: 20.0] [OP: true] [ADMINPERM: true] [DISPLAYNAME: _Diverse]
[BLOCK GET] [21:41:34] [UUID: 92eb937a-b761-33d8-befa-0d9c5329283c] [IP: /127.0.0.1:58178] [WORLD: CraftWorld{name=world}] [LOCATION: 138:63:227] [GAMEMODE: CREATIVE] [HEALTH: 20.0] [OP: true] [ADMINPERM: true] [BLOCK: STONE] [AMOUNT: 1] [DISPLAYNAME: _Diverse]
[BLOCK GET] [21:41:36] [UUID: 92eb937a-b761-33d8-befa-0d9c5329283c] [IP: /127.0.0.1:58178] [WORLD: CraftWorld{name=world}] [LOCATION: 138:63:227] [GAMEMODE: CREATIVE] [HEALTH: 20.0] [OP: true] [ADMINPERM: true] [BLOCK: STONE] [AMOUNT: 1] [DISPLAYNAME: _Diverse]
[BLOCK GET] [21:41:38] [UUID: 92eb937a-b761-33d8-befa-0d9c5329283c] [IP: /127.0.0.1:58178] [WORLD: CraftWorld{name=world}] [LOCATION: 138:63:227] [GAMEMODE: CREATIVE] [HEALTH: 20.0] [OP: true] [ADMINPERM: true] [BLOCK: GRASS] [AMOUNT: 64] [DISPLAYNAME: _Diverse]
[BLOCK GET] [21:41:40] [UUID: 92eb937a-b761-33d8-befa-0d9c5329283c] [IP: /127.0.0.1:58178] [WORLD: CraftWorld{name=world}] [LOCATION: 138:63:227] [GAMEMODE: CREATIVE] [HEALTH: 20.0] [OP: true] [ADMINPERM: true] [BLOCK: DIRT] [AMOUNT: 3] [DISPLAYNAME: _Diverse]
[BLOCK PLACE] [21:41:42] [UUID: 92eb937a-b761-33d8-befa-0d9c5329283c] [IP: /127.0.0.1:58178] [WORLD: CraftWorld{name=world}] [LOCATION: 138:63:226] [GAMEMODE: CREATIVE] [HEALTH: 20.0] [OP: true] [ADMINPERM: true] [BLOCK: DIRT] [DISPLAYNAME: _Diverse]
[BLOCK PLACE] [21:41:42] [UUID: 92eb937a-b761-33d8-befa-0d9c5329283c] [IP: /127.0.0.1:58178] [WORLD: CraftWorld{name=world}] [LOCATION: 138:63:226] [GAMEMODE: CREATIVE] [HEALTH: 20.0] [OP: true] [ADMINPERM: true] [BLOCK: GRASS] [DISPLAYNAME: _Diverse]
[BLOCK PLACE] [21:41:43] [UUID: 92eb937a-b761-33d8-befa-0d9c5329283c] [IP: /127.0.0.1:58178] [WORLD: CraftWorld{name=world}] [LOCATION: 138:63:226] [GAMEMODE: CREATIVE] [HEALTH: 20.0] [OP: true] [ADMINPERM: true] [BLOCK: STONE] [DISPLAYNAME: _Diverse]
[BLOCK BREAK] [21:41:43] [UUID: 92eb937a-b761-33d8-befa-0d9c5329283c] [IP: /127.0.0.1:58178] [WORLD: CraftWorld{name=world}] [LOCATION: 138:63:226] [GAMEMODE: CREATIVE] [HEALTH: 20.0] [OP: true] [ADMINPERM: true] [BLOCK: STONE] [DISPLAYNAME: _Diverse]
[BLOCK BREAK] [21:41:44] [UUID: 92eb937a-b761-33d8-befa-0d9c5329283c] [IP: /127.0.0.1:58178] [WORLD: CraftWorld{name=world}] [LOCATION: 138:63:226] [GAMEMODE: CREATIVE] [HEALTH: 20.0] [OP: true] [ADMINPERM: true] [BLOCK: GRASS] [DISPLAYNAME: _Diverse]
[BLOCK BREAK] [21:41:44] [UUID: 92eb937a-b761-33d8-befa-0d9c5329283c] [IP: /127.0.0.1:58178] [WORLD: CraftWorld{name=world}] [LOCATION: 138:63:226] [GAMEMODE: CREATIVE] [HEALTH: 20.0] [OP: true] [ADMINPERM: true] [BLOCK: DIRT] [DISPLAYNAME: _Diverse]
[COMMAND] [21:41:50] [UUID: 92eb937a-b761-33d8-befa-0d9c5329283c] [IP: /127.0.0.1:58178] [WORLD: CraftWorld{name=world}] [LOCATION: 138:63:226] [GAMEMODE: CREATIVE] [HEALTH: 20.0] [OP: true] [ADMINPERM: true] [CMD: '/clear' ] [DISPLAYNAME: _Diverse]
[COMMAND] [21:41:51] [UUID: 92eb937a-b761-33d8-befa-0d9c5329283c] [IP: /127.0.0.1:58178] [WORLD: CraftWorld{name=world}] [LOCATION: 138:63:226] [GAMEMODE: CREATIVE] [HEALTH: 20.0] [OP: true] [ADMINPERM: true] [CMD: '/clear' ] [DISPLAYNAME: _Diverse]
[QUIT] [21:41:52] [UUID: 92eb937a-b761-33d8-befa-0d9c5329283c] [IP: /127.0.0.1:58178] [WORLD: CraftWorld{name=world}] [LOCATION: 138:63:226] [GAMEMODE: CREATIVE] [HEALTH: 20.0] [OP: true] [ADMINPERM: true] [DISPLAYNAME: _Diverse]
[QUIT] [21:45:55] [UUID: 92eb937a-b761-33d8-befa-0d9c5329283c] [IP: /127.0.0.1:58702] [WORLD: CraftWorld{name=world}] [LOCATION: 138:63:226] [GAMEMODE: CREATIVE] [HEALTH: 20.0] [OP: true] [ADMINPERM: true] [DISPLAYNAME: _Diverse]
[JOIN] [21:45:58] [UUID: 92eb937a-b761-33d8-befa-0d9c5329283c] [IP: /127.0.0.1:58966] [WORLD: CraftWorld{name=world}] [LOCATION: 138:63:226] [GAMEMODE: CREATIVE] [HEALTH: 20.0] [OP: true] [ADMINPERM: true] [DISPLAYNAME: _Diverse]
[CHAT] [22:11:16] [UUID: 92eb937a-b761-33d8-befa-0d9c5329283c] [IP: /127.0.0.1:58966] [WORLD: CraftWorld{name=world}] [LOCATION: 138:63:226] [GAMEMODE: CREATIVE] [HEALTH: 20.0] [OP: true] [ADMINPERM: true] [MESSAGE: 'x' ]
[COMMAND] [22:11:57] [UUID: 92eb937a-b761-33d8-befa-0d9c5329283c] [IP: /127.0.0.1:58966] [WORLD: CraftWorld{name=world}] [LOCATION: 138:63:226] [GAMEMODE: CREATIVE] [HEALTH: 20.0] [OP: true] [ADMINPERM: true] [CMD: '/apl' ]
[COMMAND] [22:11:59] [UUID: 92eb937a-b761-33d8-befa-0d9c5329283c] [IP: /127.0.0.1:58966] [WORLD: CraftWorld{name=world}] [LOCATION: 138:63:226] [GAMEMODE: CREATIVE] [HEALTH: 20.0] [OP: true] [ADMINPERM: true] [CMD: '/apl reload' ]
[QUIT] [22:17:18] [UUID: 92eb937a-b761-33d8-befa-0d9c5329283c] [IP: /127.0.0.1:58966] [WORLD: CraftWorld{name=world}] [LOCATION: 138:63:226] [GAMEMODE: CREATIVE] [HEALTH: 20.0] [OP: true] [ADMINPERM: true]
