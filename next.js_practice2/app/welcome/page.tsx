
async function GetGreeting() {
    return (await fetch('http://localhost:8080/greeting?name=Lars')).json()
}

export default async function Welcome() {
    const res = await GetGreeting();

    return <h1>{res.content}</h1>
}



