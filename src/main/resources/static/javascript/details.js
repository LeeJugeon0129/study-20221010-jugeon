const size = document.querySelector("#size-select");

const pName = document.querySelector("#pName").innerHTML;

const totalPrice = document.querySelector("#total-price");
const line = document.querySelector("#line");


let productList = new Array();

let price = 74000;

size.onchange = () => {
    addMenu();
    loadList();

}
function addMenu() {
    
    const sizeValue = document.querySelector("#size-select");

    let product = {
        prodName: pName,
        pSize: sizeValue.options[sizeValue.selectedIndex].value
    }
    productList.push(product);

    totalPrice.innerHTML = "";

    totalPrice.innerHTML += `
        <td>
            <p>${pName} - ${sizeValue.options[sizeValue.selectedIndex].value}</p>
        </td>
        <td>
        <input id="count-box" type="number" value="1" min="0">
        </td>
        <td>${price}</td>
    `

    line.innerHTML = "";

    line.innerHTML += `
        <tr>
            <td colspan="3"><hr></td>
        </tr>
    `
}

function loadList(){
    totalPrice.innerHTML="";

    // productList.while (true) {
        
    // }
}


