package ro.tuc.ds2020.services;

import ro.tuc.ds2020.dtos.ConsumptionDTO;
import ro.tuc.ds2020.dtos.DeviceDTO;
import ro.tuc.ds2020.dtos.RoleDTO;
import ro.tuc.ds2020.dtos.UserDTO;
import java.time.LocalDate;
import java.util.List;

public interface UserService {
    List<DeviceDTO> getUserDevices(Long id);

    List<UserDTO> getAll();

    UserDTO create(UserDTO userDTO) throws Exception;
    RoleDTO createRole(RoleDTO roleDto) throws Exception;

    UserDTO get(Long id);

    UserDTO update(UserDTO userDto);

    Boolean delete(Long id);

    UserDTO findByNameAndPassword(String name, String password);

    List<ConsumptionDTO> getConsumption (Long id, LocalDate date);
}
