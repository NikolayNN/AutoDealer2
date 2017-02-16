<c:forEach items="${adverts}" var="advert">
    <table>
        <tr>
            <td>
                <span class="text">Maker</span>
            </td>
            <td>
                <span class="text">${advert.car.makerInfo.refMaker.maker}</span>
            </td>
        </tr>
        <tr>
            <td>
                <span class="text">model</span>
            </td>
            <td>
                <span class="text">${advert.car.makerInfo.refModel.model}</span>
            </td>
        </tr>
        <tr>
            <td>
                <span class="text">car body</span>
            </td>
            <td>
                <span class="text">${advert.car.makerInfo.refCarBody.carBody}</span>
            </td>
        </tr>
        <tr>
            <td>
                <span class="text">transmission</span>
            </td>
            <td>
                <span class="text">${advert.car.makerInfo.refTransmission.transmission}</span>
            </td>
        </tr>
        <tr>
            <td>
                <span class="text">fuel type</span>
            </td>
            <td>
                <span class="text">${advert.car.makerInfo.refFuelType.fuelType}</span>
            </td>
        </tr>
        <tr>
            <td>
                <span class="text">condition</span>
            </td>
            <td>
                <span class="text">${advert.car.ownerInfo.refCondition.condition}</span>
            </td>
        </tr>
        <tr>
            <td>
                <span class="text">cubic capacity</span>
            </td>
            <td>
                <span class="text">${advert.car.makerInfo.capacity}</span>
            </td>
        </tr>
        <tr>
            <td>
                <span class="text">year</span>
            </td>
            <td>
                <span class="text">${advert.car.makerInfo.year}</span>
            </td>
        </tr>
        <tr>
            <td>
                <span class="text">mileage</span>
            </td>
            <td>
                <span class="text">${advert.car.ownerInfo.mileage}</span>
            </td>
        </tr>
        <tr>
            <td>
                <span class="text">price</span>
            </td>
            <td>
                <span class="text">${advert.car.ownerInfo.price}</span>
            </td>
        </tr>
        <tr>
            <td>
                <span class="text">description</span>
            </td>
            <td><span class="text">${advert.car.ownerInfo.description}</span></td>
        </tr>
        <tr>
            <td>
                <span class="text">added</span>
            </td>
            <td>
                <span class="text">${advert.users.name}</span>
            </td>
        </tr>
    </table>
    <hr/>
</c:forEach>

