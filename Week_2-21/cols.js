//Zabian Threatt
//This program takes an array of colors and returns how long (in seconds) it would take to color a pattern

const colorPatternTimes = (cols) => {
    let color_time = 2;
    let curr_color;
    let prev_color;

    for(let i = 1; i < cols.length; i++){
        curr_color = cols[i];
        prev_color = cols[i-1];
        color_time += 2;

        if(curr_color != prev_color)
            color_time += 1;
    }

    console.log(color_time);
}

colorPatternTimes(["Blue"]) //returns 2

colorPatternTimes(["Red", "Yellow", "Green", "Blue"]) //returns 11

colorPatternTimes(["Blue", "Blue", "Blue", "Red", "Red", "Red"]) //returns 13

colorPatternTimes(["Red", "Blue", "Red", "Blue", "Red"]) //returns 14