const TodoList = ({ tasks, deleteTask, toggleTask }) => {
  return (
    <div>
      {tasks.map((task) => (
        <div className="task" key={task.id}>
          <input
            type="checkbox"
            checked={task.completed}
            onChange={() => toggleTask(task.id)}
          />

          <span
            style={{
              textDecoration: task.completed
                ? "line-through"
                : "none",
            }}
          >
            {task.text}
          </span>

          <button onClick={() => deleteTask(task.id)}>
            Delete
          </button>
        </div>
      ))}
    </div>
  );
};

export default TodoList;