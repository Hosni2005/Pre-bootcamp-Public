import { useState } from "react"

const ConditionalRendering = () => {
    const [isClicked, setIsClicked] = useState(false);

    const renderParagraph = () => {
        if(isClicked === true) {
            return (<p>Clicked</p>)
        } else {
            return (<p>Not Clicked</p>)
        }
    }

    return (
    <div>
        {isClicked === true ? <p>Clicked</p> : <p>Not Clicked</p>}
        <button onClick={(e) => setIsClicked(!isClicked)}>Click</button>
    </div>
    );
}

export default ConditionalRendering