
const writeButton = document.querySelector("#btn-w");

let titleList = new Array();

writeButton.onclick = () => {
    send();
    load();
}

function send() {
    const inputTitle = document.querySelector("#title");

    let title = {
        title: inputTitle.value
    }

    titleList.push(title);
}

function load() {
    const tbody = document.querySelector("#load");

    tbody.innerHTML = "";

    titleList.forEach((title, index) => {
        tbody.innerHTML += `
            <tr>
            <td>-</td>
            <td colspan="4">-</td>
            <td>${title.title}</td>
            <td>-</td>
            <td>-</td>
            <td>-</td>
            </tr>
        `
    });

    
}