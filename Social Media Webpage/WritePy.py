with open("Home.html", "a") as f:
    for i in range(0, 16777216):
        if i < 16:
            f.write(f"<h1 style=\"background-color: #00000{str(hex(i)[2:])};\">#00000{str(hex(i)[2:])}</h1>\n")
        elif i < 256:
            f.write(f"<h1 style=\"background-color: #0000{str(hex(i)[2:])};\">#0000{str(hex(i)[2:])}</h1>\n")
        elif i < 4096:
            f.write(f"<h1 style=\"background-color: #000{str(hex(i)[2:])};\">#000{str(hex(i)[2:])}</h1>\n")
        elif i < 65536:
            f.write(f"<h1 style=\"background-color: #00{str(hex(i)[2:])};\">#00{str(hex(i)[2:])}</h1>\n")
        elif i < 1048576:
            f.write(f"<h1 style=\"background-color: #0{str(hex(i)[2:])};\">#0{str(hex(i)[2:])}</h1>\n")
        elif i < 16777216:
            f.write(f"<h1 style=\"background-color: #{str(hex(i)[2:])};\">#{str(hex(i)[2:])}</h1>\n")
