const UsersTable = () => {
    const users = [
        { id: 1, name: "Chaker", age: 18 },
        { id: 2, name: "Aws", age: 28 },
        { id: 3, name: "Murad", age: 38 },
        { id: 4, name: "Husni", age: 22 },
        { id: 5, name: "Abdallah", age: 98 },
        { id: 6, name: "Jalil", age: 78 },
        { id: 7, name: "Rafeef", age: 19 },
        { id: 8, name: "Ramez", age: 48 },
    ]


    return(
        <table>
            <thead>
                <tr>
                    <th>id</th>
                    <th>name</th>
                    <th>age</th>
                </tr>
            </thead>
            <tbody>
                {users.length > 0 ? users.map((user, idx) => {
                    return (
                        <tr key={user.id}>
                            <td>{user.id}</td>
                            <td>{user.name}</td>
                            <td>{user.age}</td>
                        </tr>
                    )
                })
            :
            <p>You have no users</p>
            }
            </tbody>
        </table>
    )
}

export default UsersTable;