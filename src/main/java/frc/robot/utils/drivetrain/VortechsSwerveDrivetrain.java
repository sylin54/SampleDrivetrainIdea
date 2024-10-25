package frc.robot.utils.drivetrain;

import com.ctre.phoenix6.mechanisms.swerve.SwerveDrivetrain;
import com.ctre.phoenix6.mechanisms.swerve.SwerveDrivetrainConstants;
import com.ctre.phoenix6.mechanisms.swerve.SwerveModuleConstants;

import edu.wpi.first.math.Matrix;
import edu.wpi.first.math.numbers.N1;
import edu.wpi.first.math.numbers.N3;

/*
author: Ben

Purpose: to extend the default phoenix drivetrain and change it so that we can actually use advantagekit and better pose with
 */

public class VortechsSwerveDrivetrain extends SwerveDrivetrain{

    public VortechsSwerveDrivetrain(SwerveDrivetrainConstants driveTrainConstants, double OdometryUpdateFrequency,
            Matrix<N3, N1> odometryStandardDeviation, Matrix<N3, N1> visionStandardDeviation,
            SwerveModuleConstants[] modules) {
        super(driveTrainConstants, OdometryUpdateFrequency, odometryStandardDeviation, visionStandardDeviation, modules);
        //TODO Auto-generated constructor stub

    
    }

    public void setOdometryCallback() {


    }
    //giving up on the o

    public interface SwerveOdometryCallback {
    
        
    }
    
}
