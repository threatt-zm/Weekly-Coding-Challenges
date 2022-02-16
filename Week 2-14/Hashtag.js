//Zabian Threatt
//This program retrieves the top 3 longest words of a newspaper headline and transforms them into hashtags.

const getHashTags = (headline) => {
    let array = headline.split(/[, ]+/);
    array.sort((a,b) => b.length-a.length);
    let hashtags = [];

    for(let i = 0; i < array.length; i++){
        hashtags.push("#" + array[i].toLowerCase());
        if(i == 2)
            break;
    }
    console.log(hashtags);
}

getHashTags("How the Avocado, Became the Fruit of the Global Trade"); 
//returns ["#avocado", "#became", "#global"]

getHashTags("Why You Will Probably Pay More for Your Christmas Tree This Year")
//returns ["#christmas", "#probably", "#will"]

getHashTags("Hey Parents, Surprise, Fruit Juice Is Not Fruit")
//returns ["#surprise", "#parents", "#fruit"]

getHashTags("Visualizing Science")
//returns ["#visualizing", "#science"]